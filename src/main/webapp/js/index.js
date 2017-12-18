$(document).ready(function(){
//	Sys_user.selectall();
});
Sys_user = (function(){
	
	// 基本信息新增
	function add(){
		var sys_user = {
				id : $("#id").val(),
				name : $("#name").val(),
				age : $("#age").val(),
				password : $("#password").val(),
				status : $("#status").val(),
				createtime : $("#createtime").val()
		};
		$.ajax({
	    	type : "POST" , 
	    	url : "sys_user/add" , 
	    	contentType : "application/json",
	    	dataType : "JSON",
	    	data : JSON.stringify(sys_user), 
	    	success : function(data) {
	    		console.info("执行成功："+data);
	    	},
	    	error : function(data) {
	    		console.error("执行失败："+data);
	    	}
	    });
	}
	
	// 基本信息修改
	function upd(){
		var sys_user = {
				id : $("#id").val(),
				name : $("#name").val(),
				age : $("#age").val(),
				password : $("#password").val(),
				status : $("#status").val(),
				createtime : $("#createtime").val()
		};
		$.ajax({
			type : "POST" , 
			url : "sys_user/upd" , 
			contentType : "application/json",
			dataType : "JSON",
			data : JSON.stringify(sys_user), 
			success : function(data) {
	    		console.info("执行成功："+data);
	    	},
	    	error : function(data) {
	    		console.error("执行失败："+data);
	    	}
		});
	}
	
	// 主键删除
	function del(){
		$.ajax({
			type : "POST" , 
			url : "sys_user/del" , 
			dataType : "JSON",
			data : {
				"primarykey":$("#delid").val()
			}, 
			success : function(data) {
	    		console.info("执行成功："+data);
	    	},
	    	error : function(data) {
	    		console.error("执行失败："+data);
	    	}
		});
	}
	
	// 主键查询对象
	function selectone(){
		$.ajax({
	    	type : "POST" , 
	    	url : "sys_user/selectone" , 
	    	dataType : "JSON",
	    	data : {
				"primarykey":$("#oneid").val()
			}, 
	    	success : function(data) {
	    		console.info("执行成功："+data);
	    		var str = "";
	    			str += JSON.stringify(data)+"<br/>";
	    		$("#data").html(str);
	    	},
	    	error : function(data) {
	    		console.error("执行失败："+data);
	    	}
	    });
	}
	
	// 全查集合
	function selectall(){
		$.ajax({
	    	type : "POST" , 
	    	url : "sys_user/selectall" , 
	    	dataType : "JSON",
	    	data : '', 
	    	success : function(data) {
	    		console.info("执行成功："+data.list);
	    		var str = "";
	    		for(var i=0;i<data.list.length;i++){
	    			str += JSON.stringify(data.list[i])+"<br/>";
	    		}
	    		$("#data").html(str);
	    	},
	    	error : function(data) {
	    		console.error("执行失败："+data);
	    	}
	    });
	}
	
	// 全查集合
	function search(){
		var sys_user = {
				id : $("#id").val(),
				name : $("#name").val(),
				age : $("#age").val(),
				password : $("#password").val(),
				status : $("#status").val(),
				createtime : $("#createtime").val()
		};
		$.ajax({
	    	type : "POST" , 
	    	url : "sys_user/search" , 
	    	contentType : "application/json",
	    	dataType : "JSON",
	    	data : JSON.stringify(sys_user), 
	    	success : function(data) {
	    		console.info("执行成功："+data.list);
	    		var str = "";
	    		for(var i=0;i<data.list.length;i++){
	    			str += JSON.stringify(data.list[i])+"<br/>";
	    		}
	    		$("#data").html(str);
	    	},
	    	error : function(data) {
	    		console.error("执行失败："+data);
	    	}
	    });
	}
	
	return{
		add:add,
		upd:upd,
		del:del,
		selectone:selectone,
		selectall:selectall,
		search:search
	}
})();
