import os
import re
import requests
from collections import defaultdict

LEETCODE_GRAPHQL_URL = "https://leetcode.com/graphql"

def get_topics_from_leetcode(title_slug):
    """Fetch topic tags for a problem using LeetCode GraphQL API."""
    query = """
    query singleQuestionTopicTags($titleSlug: String!) {
      question(titleSlug: $titleSlug) {
        topicTags {
          name
        }
      }
    }
    """
    payload = {
        "query": query,
        "variables": {"titleSlug": titleSlug}
    }
    headers = {"Content-Type": "application/json", "User-Agent": "Mozilla/5.0"}
    try:
        response = requests.post(LEETCODE_GRAPHQL_URL, json=payload, headers=headers)
        if response.status_code == 200:
            data = response.json()
            tags = data.get("data", {}).get("question", {}).get("topicTags", [])
            return [tag["name"] for tag in tags]
    except Exception as e:
        print(f"Error fetching tags for {titleSlug}: {e}")
    return ["Uncategorized"]

def main():
    root_dir = "."
    pattern = re.compile(r"^\d{4}-")  # Matches folders like 0026-remove-duplicates...
    
    # Map topic -> list of folder names
    topic_map = defaultdict(list)
    
    entries = sorted([d for d in os.listdir(root_dir) if os.path.isdir(d) and pattern.match(d)])
    
    print(f"Found {len(entries)} problem folders.")

    for folder in entries:
        # Extract title slug by stripping leading digits and dash (e.g., 'remove-duplicates-from-sorted-array')
        slug = re.sub(r"^\d+ -?", "", folder).strip()
        tags = get_topics_from_leetcode(slug)
        
        for tag in tags:
            if folder not in topic_map[tag]:
                topic_map[tag].append(folder)

    # Build Markdown Content
    content = ["# LeetCode Topics\n"]
    
    for topic in sorted(topic_map.keys()):
        content.append(f"## {topic}\n")
        content.append("| Problem Folder |")
        content.append("| :--- |")
        for folder in topic_map[topic]:
            content.append(f"| [{folder}](./{folder}) |")
        content.append("\n")

    with open("README.md", "w", encoding="utf-8") as f:
        f.write("\n".join(content))

    print("README.md generated successfully!")

if __name__ == "__main__":
    main()
