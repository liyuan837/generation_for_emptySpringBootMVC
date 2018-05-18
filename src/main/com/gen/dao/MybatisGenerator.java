package com.gen.dao;

import com.gen.conf.Config;
import com.gen.dao.annotation.NotTokenGenerator;
import com.gen.dao.common.*;
import com.gen.dao.config.MyBatisConfigurationGenerator;
import com.gen.dao.config.WebConfigurationGenerator;
import com.gen.dao.detail.*;
import com.gen.dao.enter.WebApplicationGenerator;
import com.gen.dao.filter.AccessFilterGenerator;
import com.gen.dao.interceptor.JwtInterceptorGenerator;
import com.gen.dao.properties.*;
import com.gen.dao.util.JwtUserGenerator;
import com.gen.dao.util.JwtUtilGenerator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 代码生成类
 *
 * Created by caowei on 2017/8/31.
 */
public class MybatisGenerator {
	public void init() throws Exception {
		//[1]生成BaseCondition.java
		writeFile(Config.baseXXXPath,"BaseCondition.java",new BaseConditionGenerator().generate());

		//[2]生成自定义异常类
		writeFile(Config.customExceptionPath,Config.exceptionName+".java",new ExceptionGenerator().generate());

		//[3]生成BaseMapper.java类
		writeFile(Config.baseXXXPath,"BaseMapper.java",new BaseMapperGenerator().generate());

		//[4]生成BaseService.java类
		writeFile(Config.baseXXXPath,"BaseService.java",new BaseServiceGenerator().generate());

		//[5]生成BaseServiceImpl.java类
		writeFile(Config.baseXXXPath,"BaseServiceImpl.java",new BaseServiceImplGenerator().generate());

		//[6]生成BaseController.java类
		writeFile(Config.baseXXXPath,"BaseController.java",new BaseControllerGenerator().generate());

		//[7]生成BaseQueryForm.java类
		writeFile(Config.baseXXXPath,"BaseQueryForm.java",new BaseQueryFormGenerator().generate());


		//[8]生成PageListResponse.java
		writeFile(Config.responsePath,"PageListResponse.java",new PageListResponseGenerator().generate());

		//[9]生成ResponseEntity.java
		writeFile(Config.responsePath,"ResponseEntity.java",new ResponseEntityGenerator().generate());

		//[10]生成CopyUtil.java
		writeFile(Config.commonUtilPath,"CopyUtil.java",new CopyUtilGenerator().generate());

		//[11]生成DateCopyUtil.java
		writeFile(Config.commonUtilPath,"DateUtil.java",new DateUtilGenerator().generate());

		//[12]生成JSONUtil.java
		writeFile(Config.commonUtilPath,"JSONUtil.java",new JSONUtilGenerator().generate());

		//[13]生成PageHelperUtil.java
		writeFile(Config.commonUtilPath,"PageHelperUtil.java",new PageHelperUtilGenerator().generate());

		//[13]pom.xml
		writeFile(Config.mainPomPath,"pom.xml",new MainPomGenerator().generate());
		writeFile(Config.commonPomPath,"pom.xml",new CommonPomGenerator().generate());
		writeFile(Config.domainPomPath,"pom.xml",new DomainPomGenerator().generate());
		writeFile(Config.daoPomPath,"pom.xml",new DaoPomGenerator().generate());
		writeFile(Config.servicePomPath,"pom.xml",new ServicePomGenerator().generate());
		writeFile(Config.webPomPath,"pom.xml",new WebPomGenerator().generate());

		//[14]生成application.properties
		writeFile(Config.applicationPropertiesPath,"application.properties",new ApplicationPropertiesGenerator().generate());

		//[补充]生成入口启动类
		writeFile(Config.basePackagePath,Config.webApplicationName+".java",new WebApplicationGenerator().generate());

		//[15]生成config包下的配置类
		writeFile(Config.basePackagePath + "config/","MyBatisConfiguration.java",new MyBatisConfigurationGenerator().generate());
		writeFile(Config.basePackagePath + "config/","WebConfiguration.java",new WebConfigurationGenerator().generate());

		//[16]生成filter包下的过滤器类
		writeFile(Config.basePackagePath + "filter/","AccessFilter.java",new AccessFilterGenerator().generate());

		//[17]生成interceptor包下的拦截器类
		writeFile(Config.basePackagePath + "interceptor/","JwtInterceptor.java",new JwtInterceptorGenerator().generate());

		//[18]生成annotation包下的注解类
		writeFile(Config.basePackagePath + "annotation/","NotToken.java",new NotTokenGenerator().generate());

		//[19]生成util包下的工具类
		writeFile(Config.basePackagePath + "util/","JwtUtil.java",new JwtUtilGenerator().generate());
		writeFile(Config.basePackagePath + "util/","JwtUser.java",new JwtUserGenerator().generate());

	}


	public void generate(String tableName) throws Exception{

		// [1]获取数据表信息
		DatabaseTableInfo dbTableInfo = DatabaseTableInfo.getInstance(tableName);

		// [2]生成模板代码
		writeFile(Config.mapperXMLPath, dbTableInfo.getMapperClassName()+ ".xml", new SqlMapXMLGenerator().generate(dbTableInfo));
		writeFile(Config.mapperJavaPath, dbTableInfo.getMapperClassName()+ ".java", new DaoGenerator().generate(dbTableInfo));
		writeFile(Config.servicePath, dbTableInfo.getServiceClassName() + ".java", new ServiceGenerator().generate(dbTableInfo));
		writeFile(Config.serviceImplPath, dbTableInfo.getServiceImplClassName() + ".java", new ServiceImplGenerator().generate(dbTableInfo));
		writeFile(Config.controllerPath, dbTableInfo.getControllerClassName() + ".java", new ControllerGenerator().generate(dbTableInfo));

		writeFile(dbTableInfo.getPo().getFilePath(), dbTableInfo.getPo().getClassName()+ ".java", dbTableInfo.getPo().toString());
		writeFile(dbTableInfo.getCondition().getFilePath(), dbTableInfo.getCondition().getClassName()+ ".java", dbTableInfo.getCondition().toString());
		writeFile(dbTableInfo.getCreateForm().getFilePath(), dbTableInfo.getCreateForm().getClassName()+ ".java", dbTableInfo.getCreateForm().toString());
		writeFile(dbTableInfo.getQueryForm().getFilePath(), dbTableInfo.getQueryForm().getClassName()+ ".java", dbTableInfo.getQueryForm().toString());
		writeFile(dbTableInfo.getUpdateForm().getFilePath(), dbTableInfo.getUpdateForm().getClassName()+ ".java", dbTableInfo.getUpdateForm().toString());
		writeFile(dbTableInfo.getUpdateForm().getFilePath(), dbTableInfo.getDeleteForm().getClassName()+ ".java", dbTableInfo.getDeleteForm().toString());
		writeFile(dbTableInfo.getVo().getFilePath(), dbTableInfo.getVo().getClassName()+ ".java", dbTableInfo.getVo().toString());

	}

	/**
	 * 生成类文件
	 *
	 * @param dirPath
	 * @param fileName
	 * @param data
	 * @throws Exception
     */
	private void writeFile(String dirPath, String fileName, String data) throws Exception {
		createNecessaryFile(dirPath);
		FileOutputStream fos = new FileOutputStream(dirPath + fileName);
		fos.write(data.getBytes("UTF-8"));
		fos.close();
	}

	private void createNecessaryFile(String file){
		File f=new File(file);
		if(!f.exists()){
			f.mkdirs();
		}
	}

}
