<!DOCTYPE>
<html>  
<body>  
<div>  
<dialog id="myFirstDialog" style="width:50%;background-color:#F4FFEF;border:1px dotted black;">  
<p><q>I would like to use this note to thank you for your highly effective feedback. The information you gave us was of tremendous value to us. Thanks once again.   
</q> - <cite>E-Learning </cite></p>  
<button id="hide">Close</button>  
</dialog>  
<button id="show">CLICK TO EXIT</button>  
</div>  
  
<!-- JavaScript to provide the "Show/Close" functionality -->  
<script type="text/JavaScript">  
(function() {    
    var dialog = document.getElementById('myFirstDialog');    
    document.getElementById('show').onclick = function() {    
        dialog.show();    
    };    
    document.getElementById('hide').onclick = function() {    
        dialog.close();    
    };    
})();   
</script>  
</body>
</html>  

 
