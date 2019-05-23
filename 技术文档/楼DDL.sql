CREATE TABLE `zy_lfqg_0` (
  `title` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xm` varchar(255) DEFAULT NULL COMMENT '项目',
  `nl` varchar(255) DEFAULT NULL COMMENT '年龄',
  `jg` varchar(255) DEFAULT NULL COMMENT '价格',
  `dq` varchar(255) DEFAULT NULL COMMENT '地区',
  `nr` varchar(10000) DEFAULT NULL COMMENT '内容',
  `zp` varchar(255) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15268 DEFAULT CHARSET=utf8mb4;
