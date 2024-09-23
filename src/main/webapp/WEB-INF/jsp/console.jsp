<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>AMGREAT CONSOLE</title>
	<link rel="stylesheet" href="http://localhost:8091/css/main.css" token="" id="">
	<link rel="stylesheet" href="http://localhost:8091/css/face.css" token="" id="">
	<script src="http://localhost:8091/js/jquery-3.7.1.min.js"></script>
	<script src="http://localhost:8091/js/main.js" token="" id=""></script>
	<style>
		.box-1.contain{ border:0.2px solid #c0c0c0; border-radius:5px; width:100%; height:100%; margin-top:0px;margin-bottom:0px;margin:auto;}
		.box-1.play{ border:0.2px solid #c0c0c0; border-radius:5px; height:95%; width:95%; margin-left:auto; margin-right:auto;margin-top:1.5%;}
		
		@media only screen and (max-width: 600px) {
			.box-1.contain{ border:0.2px solid #c0c0c0; border-radius:5px; width:90%; height:50%; margin-top:0px;margin-bottom:0px;}
			.box-1.play{ border:0.2px solid #c0c0c0; border-radius:5px; height:95%; width:85%; margin-left:auto; margin-right:auto;margin-top:1.5%;}
		}
		
	</style>
</head>
<body>
		<div class="container-h h-05" id="CL1" style="z-index:17;">
			<div class="col-5 txr ptr top-hamb p-8">
				<div class="hambbox">
					<div class="hamb" targetpop="__popup" id="__hamb1" onclick="__fshow(this, event);"></div>
					<div class="hamb" targetpop="__popup" id="__hamb2" onclick="__fshow(this, event);"></div>
					<div class="hamb" targetpop="__popup" id="__hamb3" onclick="__fshow(this, event);"></div>
				</div>
			</div>
			<div class="col-60 mobile txc" style="z-index:20;" id="__r2c2">
				<div class="linkurigrp mobile p-6">
					<span class="linkuri br" id="home" targetpop="content" actiongo="__fpage" params="('home.html', 'param2', 'param3')">HOME</span>
					<span class="linkuri br" id="contact" targetpop="content" actiongo="__fpage" params="('contact', 'param2', 'param3')">Contact</span>
					<span class="linkuri br" id="solutions" targetpop="content" actiongo="__fpage" params="('solutions', 'param2', 'param3')">Solutions</span>
					<span class="linkuri br" id="busapp" targetpop="content" actiongo="__fpage" params="('busapp', 'param2', 'param3')">Business Application</span>
					<span class="linkuri br" id="dataplatform" targetpop="content" actiongo="__fpage" params="('dataplatform', 'param2', 'param3')">Data Platform</span>
					<span class="linkuri br" id="security" targetpop="content" actiongo="__fpage" params="('param1', 'security', 'param3')">Security</span>
					<span class="linkuri br" id="cloudtransformation" targetpop="content" actiongo="__fpage" params="('cloudtransformations', 'param2', 'param3')">Cloud Transformation</span>
				</div>
			</div>
			<div class="col-5 txl" id="__r1c4" style="z-index:17;">
				<div class="linkurigrp mobile p-6">
					<span class="linkuri" id="login" targetpop="content" actiongo="__fpage" params="('console.html', 'param2', 'param3')">Console</span>
					<span class="linkuri" id="login" targetpop="content" actiongo="__fpage" params="('login', 'param2', 'param3')">Login</span>
					<span class="linkuri" id="user" targetpop="content" actiongo="__fpage" params="('user', 'param2', 'param3')">Users</span>
				</div>
			</div>
		</div>
		
		<div class="container h-03 mobile" id="CL2">
			<div class="col-1" id="col-4">&nbsp;</div>
		</div>	
		
		<div class="container h-9 mobilesize p-6" id="CL2">
			<div class="col-5 m-2 mobile b1" id="col-4">
				<div class="box-85 h-9 m-2 p-8overflow" id="_me_"></div>
			</div>
			<div class="col-80 m-2 b1 h-10" id="__content"> 
				<div class="box-95 m-2 p-8 overflow">
					<div class="box-95 m-0 p-8 b1 txr"> header </div>
					<div class="box-95 m-0 h-8 p-8 b1 overflow"> content </div>
					<div class="box-95 m-0 p-8 b1 txr"> button </div>	
				</div>
			</div>
		</div>
		
		<div class="container" id="CL4" style="z-index:7;">
			<div class="col-1 txc p-8" id="col-8">&copy; PT AMGREAT INDONESIA</div>
		</div>
		
		<div class="container h-9 onfixed m-0 p-0" style="display:none;z-index:25;" id="__popup">
			<div class="col-5">&nbsp;</div>
			<div class="col-60 innerpopup h-10 txc">
				<content class="col-1 m-1 h-8">
					<div class="container col-1 m-0">
						<div  class="col-1"></div>
						<div  class="col-9 close m-3" onclick="__fshow(this, event);" id="__popup_child" targetpop="__popup"></div>
					</div>
					<div class="container col-1 m-0 txc" id="CL3">
						<div  class="col-4 "></div>
						<div  class="col-2">[TITLE]</div>
						<div  class="col-4"></div>
					</div>
					<div class="container col-1 h-10 txl uline" id="CL3">
						<div  class="col-1 p-8 h-10" id="__popcontent">sample</div>
					</div>
					<div class="container col-1 txc p-6" id="CL3">
						<div  class="col-2">[button]</div>
						<div  class="col-60">[button]</div>
						<div  class="col-2">[button]</div>
					</div>
				</content>
			</div>
			<div class="col-5"></div>
		</div>
		
		<div id="__progress">
			<div class="loader">
			  <span class="loader__element"></span>
			  <span class="loader__element"></span>
			  <span class="loader__element"></span>
			</div>
		</div>
		
</body>
</html>
	
<script type="text/javascript">
	
	var __data = { pageId:"amgreatappsid"};
	
	var __url = "http://localhost:8091/amgreate/api/int/fe";
	
	var __setHtml = ( __id, __o ) => {
		//JSON.parse(txt)
		
		//document.getElementById( __id ).innerHTML = JSON.stringify( __o.rows );
		
		for (var idx in __o.rows ) {
			var _row = __o.rows[idx];
			var _row_row = JSON.parse( _row.row );
			
			document.getElementById( __id ).innerHTML += _row_row.__ID + "<br/>";
			document.getElementById( __id ).innerHTML += '<img src = "http://localhost:8091/svg/check-2.svg"/>' + _row_row.__LABEL+ "<br/>";
			document.getElementById( __id ).innerHTML += _row_row.__ICONID+ "<br/>";
		}
	};
	
	
	var __fmobile = () => {
			
			console.log(" executed __fmobile ");
			
			__setHtml('_me_', ' me menu '); 
			
			 $.ajax({ headers: { 'Accept': 'application/json', 'Content-Type': 'application/json; charset=UTF-8' }, 
			 	url : __url, dataType:'json', type: "POST", timeout: 15000, data : JSON.stringify(__data),
			    success: function( data, textStatus, jqXHR)
			    {
			    	__setHtml('_me_', data );
			    },
			    error: function (jqXHR, textStatus, errorThrown)
			    {
			    	console.log( JSON.stringify(errorThrown) );
			    }
			});	
		};
	
	__fmobile();
	
</script>