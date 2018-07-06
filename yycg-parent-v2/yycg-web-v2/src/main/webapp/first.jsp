<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/tag.jsp"%>
<html>
  <head>
    <title>医药集中采购系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<LINK rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/easyui/styles/default.css">
	<%@ include file="/common/common_css.jsp"%>
	<%@ include file="/common/common_js.jsp"%>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/first.js"></script>

<META name="GENERATOR" content="MSHTML 9.00.8112.16540">
	  <script type="text/javascript">
		  $(function () {
              $('#tt').tabs({
                  border:false,
                  onSelect:function(title){
                      alert(title+' is selected');
                  }
              });
          })
	  </script>
</HEAD>

<BODY style="overflow-y: hidden;" class="easyui-layout" scroll="no">
	<DIV
		style='background: url("${pageContext.request.contextPath}/images/layout-browser-hd-bg.gif") repeat-x center 50% rgb(127, 153, 190); height: 30px; color: rgb(255, 255, 255); line-height: 20px; overflow: hidden; font-family: Verdana, 微软雅黑, 黑体;'
		border="false" split="true" region="north">
		<SPAN style="padding-right: 20px; float: right;" class="head">
			欢迎当前用户：${activeUser.username }&nbsp;&nbsp;
			<A href=javascript:showhelp()>使用帮助</A>
			&nbsp;&nbsp;
			<A title='修改密码' ref='modifypwd' href="#" rel='${pageContext.request.contextPath}/auth/updatepwd.action' icon='icon-null' id="modifypwd" >修改密码</A>
			&nbsp;&nbsp;
			<A id="loginOut" href=javascript:logout()>退出系统</A>

		</SPAN> <SPAN style="padding-left: 10px; font-size: 16px;"><IMG
			align="absmiddle" src="images/blocks.gif" width="20" height="20">
			医药集中采购系统</SPAN> <SPAN style="padding-left: 15px;" id="News"></SPAN>
	</DIV>

	<DIV style="background: rgb(210, 224, 242); height: 30px;" split="false"
		region="south">

		<DIV class="footer">
			系统版本号：<span id="version_number"></span>&nbsp;&nbsp;&nbsp;发布日期：<span id="version_date"></span>
		</DIV>
	</DIV>

	<DIV style="width: 250px;" id="west" title="导航菜单" split="true"
		region="west" hide="true">

		<div id="aa" class="easyui-accordion" style="width:300px;height:200px;">
			<div title="系统管理" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">
				<a id="btn1" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" style="width: 100%;text-align: left">通过id查询用户</a><br>
				<a id="btn2" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" style="width: 100%;text-align: left">传智</a>
			</div>
			<div title="药品目录" data-options="iconCls:'icon-reload'" style="padding:10px;">
				content2
			</div>
			<div title="采购单管理" iconCls="icon-reload">
				content3
			</div>
			<div title="统计分析" iconCls="icon-reload">
				content4
			</div>
		</div>
	</DIV>

	<div id="tt" class="easyui-tabs" style="width:500px;height:250px;">
		<div title="Tab1" style="padding:20px;display:none;">
			tab1
		</div>
		<div title="Tab2" data-options="closable:true" style="overflow:auto;padding:20px;display:none;">
			tab2
		</div>
		<div title="Tab3" data-options="iconCls:'icon-reload',closable:true" style="padding:20px;display:none;">
			tab3
		</div>
	</div>


</BODY>
</HTML>

