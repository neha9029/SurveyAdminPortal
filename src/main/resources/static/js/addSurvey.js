
$(document).ready(function(){

    var counter = 2;
 
		
    //Add choices dynamically
    $("#addChoice").click(function () {
				
	if(counter>10){
            alert("Only 10 textboxes allow");
            return false;
	}   
	counter++;

		
	var newTextAreaDiv = $(document.createElement('div'))
	     .attr({"id":'removeElem'+counter, "class": 'form-group shadow-textarea'});
                
	newTextAreaDiv.after().html('<label for="exampleFormControlTextarea6">Choices </label>'+
			'<input type="radio" name="answer" value="'+counter+'"></input>'+
			'<textarea class="form-check-input form-control z-depth-1" name="optionTitle" id="exampleFormControlTextarea6" row="2" placeholder="Enter Choices Here"></textarea>');
            
	newTextAreaDiv.appendTo(".formdiv");

				
     });
    
    //Remove choices on click of button

     $("#removeChoice").click(function () {
 		console.log(counter);

    	 if(counter == 2){

         alert("Please allow at least 2 choices."); 	 
       }
    	 else{
	        $("#removeElem"+counter).remove();
	    	counter--;
    	 }
        
		
     });
		
 
     
//     $("#addQuestion").click(function (){
//    	 alert("Clicked question");
//
//          $("#formdiv").clone().appendTo("body");
//
//
//     });


  
});






