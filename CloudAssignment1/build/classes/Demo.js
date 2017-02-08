function isNumber(obj)
{
	return !isNaN(parseInt(obj));
}


function validate()
{
	
		var x=document.getElementById("number1").value;
		if(!isNumber(x)){
			document.getElementById("id1").innerHTML="Please enter a valid number between 0 and 500";
		
		return false;
		}
		if(x<0 || x>125){
			document.getElementById("id1").innerHTML="Please enter a valid number between 0 and 500";
			return false;
		}
			
		
}