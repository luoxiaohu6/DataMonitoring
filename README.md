# DataMonitoring
# 使用框架：springboot、mybatis
# 使用的数据库：mysql、redis
# 使用到的技术:quarter、websocket

# 2019/7/25 18:33


此项目以sprinboot为框架实现的数据检测系统的后端部分

功能含：

  		1、登陆验证
  
 	 	2、webscoket实时向前端推送数据
  
	  	3、对数据库的增删改查（多表查询、多表插入）
  
  		4、Quartz实现对数据库数据定时统计极大值并将极大值插入小时表、分钟表（用于数据分析）
  
项目总体为：

  		1、物联接入（对数据的收集）
  
  		2、后端——数据处理（插入实时数据到数据库）https://github.com/18229809790/khml
  
 		3、后端——服务端实现(这个项目)
  
  		4、前端——数据可视化
# 2019/9/24 21:24
更新
  1.整合了redis，并在查询所有设备进行了简单的应用
  2.修复了系统时间和数据库存储的时间匹配的BUG
