// active navbar
let nav = document.querySelector(".navigation-wrap");
window.onscroll = function () {
    if(document.documentElement.scrollTop > 20){
        nav.classList.add("scroll-on");
    }else{
        nav.classList.remove("scroll-on");
    }
}
 

// nav hide 
let navBar = document.querySelectorAll(".nav-link");
let navCollapse = document.querySelector(".navbar-collapse.collapse");
navBar.forEach(function(a){
    a.addEventListener("click", function(){
        navCollapse.classList.remove("show");
    })
})
 
 //cart

 var addItemId=0;
 function cart(item)
 {
     addItemId +=1;
     var selectItems =document.createElement('div');
     selectItems.classList.add('carting');
     selectItems.setAttributes('id',addItemId);
     var img=document.createElement('img');
     img.setAttributes('src',item.chlildren[0].currentsrc);
     var cartItems = document.getElementById('title');
     selectItems.append(img);
     cartItems.append(selectItems);

 }

