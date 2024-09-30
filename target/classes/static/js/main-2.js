	var __ps = {uri:"file:///Users/admin/Documents/Apps/J2EEPROJECTS/springbootmvc/springbootmvc/src/main/webapp/WEB-INF/jsp/"}
	
	var __el = { id:"", value:"", parent:""};
	
	var __fshow = (el, event) => {  
	
		getEventDetail( event, __el );
		var __id = document.getElementById( __el.id ).getAttribute("targetpop");
		
		if( typeof __id!=='undefined' && __id !==""){
			__el.id = __id;
		}
		
		if(document.getElementById( __el.id ).style.display === 'none') 
		{	
			document.getElementById( __el.id ).style.display = 'block'; 
		} else {
			document.getElementById( __el.id ).style.display = 'none';
			document.getElementById( "__progress" ).style.display = 'none';
		}
		
		__el.id = "";
		
	};

	var __fpick = (el, event) => { getEventDetail(event, __el); };
	 
	 function getEventDetail( e, el ) {
	    var targ;
	    if (!e) {var e = window.event;}
	    if (e.target) {targ = e.target;}
	    __el.id = e.srcElement.id; 
	    __el.value = document.getElementById( e.srcElement.id ).innerHTML;
	};
	
	document.addEventListener('click', (e) => {
		e = e || window.event;
    	var target = e.target || e.srcElement, text = target.textContent || target.innerText; 
    	 __el.id = e.srcElement.id;
	     __el.value = document.getElementById(e.srcElement.id).innerHTML;
	     
	     var __action = document.getElementById( __el.id ).getAttribute("actiongo");
	     var __params = document.getElementById( __el.id ).getAttribute("params");
	     
	     if( typeof __action !== 'undefined' && typeof __params !== 'undefined' ){
	     	___p = __wrapParams( __params );  eval( __action + ___p );
		}
		
	} , false);
	var __wrapParams = (_p) => { var __arr = _p.split("|"); var __s = ""; for(i=0; i<__arr.length; i++){ __s+="'"+__arr[i]+"'"; __s="("+__s+")"; } return __s; }
	var __fpagenew = (_p1, _p2, _p3) => { 
		window.location.href = __ps.uri + _p1; 
	};
	var __fpageself = (_p1) => { 
		window.open(_p1, '_self'); 
	};