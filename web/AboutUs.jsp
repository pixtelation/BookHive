<!DOCTYPE html>
<html lang="en">
<head>
<title>Meet our Team </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="CSS1.css" rel="stylesheet" type="text/css" media="all"/>
<link href="CSS2.css" rel="stylesheet" type="text/css"/>

<style>
    
    .contain{
         display: flex;
  align-items: center;
  justify-content: center;
  height: 100%;
  padding: 5rem;
    }
   
.heading {
  color: orange;
  font-family: "Monotype Corsiva";
  text-shadow: 4px 4px 4px blue ;
  font-size: 50px;
  text-transform: uppercase;
}
    
body a {
  transition: 0.5s all;
  -webkit-transition: 0.5s all;
  -o-transition: 0.5s all;
  -moz-transition: 0.5s all;
  -ms-transition: 0.5s all;
}
html, body{
    font-size: 100%;
	font-family: 'Roboto', sans-serif;
}
body{
	background:#FFFFFF;
}
body a:hover {
    text-decoration: none;
}
/*-- header --*/
.jarallax {
    position: relative;
    background-size: cover;
    background-repeat: no-repeat;
    background-position: 50% 50%;
}
/*-- team --*/
.team{
	
	background-size:cover;
}
.team-dot {
    background:repeat 0px 0px;
    background-size: 2px;
    -webkit-background-size: 2px;
    -moz-background-size: 2px;
    -o-background-size: 2px;
    -ms-background-size: 2px;
}
.jarallax {
    position: relative;
    background-size: cover;
    background-repeat: no-repeat;
    background-position: 50% 50%;
}
.team-heading h3{
	color:#FFFFFF;
	font-size:40px;
	text-align:center;
	margin:70px 0px;
}
.team-heading h4{
    color: rgba(255, 255, 255, 0.47);
}
.team-info{
    position: relative;
    overflow: hidden;	
}
.team-info img{
	width:100%;
}
.team-caption h4{
    
    margin:0;
    color: #212121;
    font-size: 1em;
    text-transform: uppercase;
    line-height: 1.1em;
    font-weight: 800;
    letter-spacing: 1px;
}
.team-caption p{
	color: #FFFFFF;
    font-size: .8em;
    margin: 0;
}
.team-caption ul{
    padding: 0;
    margin: 0.0em 0 0 0;
}
.team-caption ul li{
    display:  ruby;
}
.team-caption ul li a {
	color: #333;
    text-align: center;
}
.team-caption ul li a i.fa.fa-facebook{
    height: 30px;
    width: 30px;
    line-height: 30px;
    border: solid 2px #FFF;
    background: none;
    color: #FFF;
    transition: 0.5s all;
    -webkit-transition: 0.5s all;
    -moz-transition: 0.5s all;
    -o-transition: 0.5s all;
    -ms-transition: 0.5s all;
}
.team-caption ul li a i.fa.fa-facebook:hover {
    background: #3b5998;
}
.team-caption ul li a i.fa.fa-twitter{
    height: 30px;
    width: 30px;
    line-height: 30px;
    border: solid 2px #FFF;
    background: none;
    color: #FFF;
    transition: 0.5s all;
    -webkit-transition: 0.5s all;
    -moz-transition: 0.5s all;
    -o-transition: 0.5s all;
    -ms-transition: 0.5s all;
}
.team-caption ul li a i.fa.fa-twitter:hover{
	background: #55acee;
}
.team-caption ul li a i.fa fa-google-plus-official{
    height: 30px;
    width: 30px;
    line-height: 30px;
    border: solid 2px #FFF;
    background: none;
    color: #FFF;
    transition: 0.5s all;
    -webkit-transition: 0.5s all;
    -moz-transition: 0.5s all;
    -o-transition: 0.5s all;
    -ms-transition: 0.5s all;
}
.team-caption ul li a i.fa fa-google-plus-official:hover{
	background: #f26522;
}
.team-caption {
    background: #FFC107;
  
    position: absolute;
    left: 0;
    bottom: 0;
    text-align: center;
    width: 100%;
    -webkit-transition: .5s all;
    transition: .5s all;
    -moz-transition: .5s all;
}
.team-info:hover .team-caption{
    background-color: transparent;
    top: 50%;
    transform: translate(0%, -50%);
    -webkit-transform: translate(0%, -50%);
    -moz-transform: translate(0%, -50%);
    -ms-transform: translate(0%, -50%);
    bottom: auto;
}
.team-info:hover .team-caption h4{
	color:#FFFFFF;
}
.team-info:before {
    background-color: rgba(0,0,0,0.85);
    border: 3px solid #FFC107;
    bottom: 0;
    content: "";
    display: inline-block;
    left: 0;
    position: absolute;
    right: 0;
    top: 0;
    opacity: 0;
    -webkit-transition: all 0.5s ease 0s;
    -moz-transition: all 0.5s ease 0s;
    -o-transition: all 0.5s ease 0s;
    transition: all 0.5s ease 0s;
}
.team-info:hover:before {
    opacity: 1;
}
/*-- //team --*/

@media(max-width:350px){
	.team-dot{
		padding: 2em 0;
	}
	.agileits-team-grid {
		float: none;
		width: 100%;
	}
	.agileits-team-grid:nth-child(2){
		margin:0em 0 0 0;
	}
}
</style>


</head>
<jsp:include page="Navigation.jsp" />
        
<body>	
	<!-- team -->
<div class="contain">
  <h1 class="heading" data-target-resolver> </h1>
</div>
				
        <div style="margin-left: 250px">			
					<div class="col-md-3 agileits-team-grid">
						<div class="team-info">
                                                    <img src="Images/Abhishek.jpg" height="350" alt="Abhishek"/>

							<div class="team-caption"> 
								<h4>Abhishek Mehta</h4>
								<p>Lead Developer</p>
								<ul>
		    <li style="float:right"><a href=" https://www.facebook.com/abhishekmehta50" target="_blank"><img src="Images/icon/facebook.png" alt=""/></a></li>
                    <li style="float:right"><a href=" https://plus.google.com/u/0/109802177128991452385" target="_blank"><img src="Images/icon/google.png" alt=""/></a></li>
                    <li style="float:right"><a href=" https://twitter.com/dheubShe" target="_blank"><img src="Images/icon/twitter.png" alt=""/></a></li>
                                                
                                                                
                                                                </ul>
							</div>
						</div>
                                        </div>
					<div class="col-md-3 agileits-team-grid">
						<div class="team-info">
							<img src="Images/amit.jpg" height="350" alt="">
							<div class="team-caption"> 
								<h4>Amit Kumar Singh</h4>
								<p>UI Designer</p>
								<ul>
		    <li style="float:right"><a href=" https://www.facebook.com" target="_blank"><img src="Images/icon/facebook.png" alt=""/></a></li>
                    <li style="float:right"><a href=" https://www.google.com" target="_blank"><img src="Images/icon/google.png" alt=""/></a></li>
                    <li style="float:right"><a href=" https://www.twitter.com" target="_blank"><img src="Images/icon/twitter.png" alt=""/></a></li>
								</ul>
							</div>
						</div>
					</div>
                                    
                                    <div class="col-md-3 agileits-team-grid">
						<div class="team-info">
							<img src="Images/Debarati.jpg" height="350" alt="">
							<div class="team-caption"> 
								<h4>Debarati Middar Bera</h4>
								<p>Database Developer</p>
								<ul>
		    <li style="float:right"><a href=" https://www.facebook.com" target="_blank"><img src="Images/icon/facebook.png" alt=""/></a></li>
                    <li style="float:right"><a href=" https://www.google.com" target="_blank"><img src="Images/icon/google.png" alt=""/></a></li>
                    <li style="float:right"><a href=" https://www.twitter.com" target="_blank"><img src="Images/icon/twitter.png" alt=""/></a></li>
								</ul>
							</div>
						</div>
					</div>
			
					
			</div>	
			
		<script  src="1.js"></script>
</body>	
</html>