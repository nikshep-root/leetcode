-- Write your PostgreSQL query statement below

select 
   id,
   sum(revenue) filter (where "month" = 'Jan') as jan_revenue,
   sum(revenue) filter (where "month" = 'Feb') as feb_revenue,
   sum(revenue) filter (where "month" = 'Mar') as mar_revenue,
   sum(revenue) filter (where "month" = 'Apr') as apr_revenue,
   sum(revenue) filter (where "month" = 'May') as may_revenue,
   sum(revenue) filter (where "month" = 'Jun') as jun_revenue,
   sum(revenue) filter (where "month" = 'Jul') as jul_revenue,
   sum(revenue) filter (where "month" = 'Aug') as aug_revenue,
   sum(revenue) filter (where "month" = 'Sep') as sep_revenue,
   sum(revenue) filter (where "month" = 'Oct') as oct_revenue,
   sum(revenue) filter (where "month" = 'Nov') as nov_revenue,
   sum(revenue) filter (where "month" = 'Dec') as dec_revenue
from Department
group by id;
