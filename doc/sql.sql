create database `db_jdeploy`;
use `db_jdeploy`;
CREATE TABLE `java_web_host` (
  `hostId` varchar(36) NOT NULL COMMENT '主机id',
  `name` varchar(255) NOT NULL COMMENT '主机名称',
  `path` varchar(255) COMMENT '主机路径,相对于webapps',
  PRIMARY KEY (`hostId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `java_deploy` (
  `uuid` varchar(36) NOT NULL COMMENT 'UUID',
  `name` varchar(255) NOT NULL COMMENT '项目名称',
  `profile` varchar(255) COMMENT 'Maven profile',
  `module` varchar(255) NOT NULL COMMENT '模块名称',
  `type` tinyint(4) NOT NULL COMMENT '版本控制工具类型(1.SVN;2.GIT)',
  `url` varchar(255) NOT NULL COMMENT 'svn/git地址',
  `branch` varchar(255) COMMENT 'git branch',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `java_web_deploy` (
  `uuid` varchar(36) NOT NULL COMMENT 'UUID',
  `name` varchar(255) NOT NULL COMMENT '项目名称',
  `profile` varchar(255) COMMENT 'Maven profile',
  `module` varchar(255) NOT NULL COMMENT '模块名称',
  `type` tinyint(4) NOT NULL COMMENT '版本控制工具类型(1.SVN;2.GIT)',
  `url` varchar(255) NOT NULL COMMENT 'svn/git地址',
  `branch` varchar(255) COMMENT 'git branch',
  `context_path` varchar(255) NOT NULL COMMENT 'Web项目contextPath',
  `port` int(11) NOT NULL COMMENT '端口号',
  `hostId` varchar(36) NOT NULL COMMENT '所属主机id 外键(java_web_host)',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE db_jdeploy.java_web_deploy ADD hostId VARCHAR(36) NOT NULL;
ALTER TABLE db_jdeploy.java_web_deploy
  ADD CONSTRAINT java_web_deploy_java_web_host_hostId_fk
FOREIGN KEY (hostId) REFERENCES java_web_host (hostId);
