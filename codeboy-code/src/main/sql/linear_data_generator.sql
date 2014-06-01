create table demo.zybigdate as select *,  3*column1+2*column2+34*column3-34*column4-23*column5+ 0.0001*columnx as column6
  from (select *,random() as column1,random() as column2,random() as column3, random() as column4
,random() as column5,random() as columnx from (  select generate_series(1,100000)) as foo) as foo1