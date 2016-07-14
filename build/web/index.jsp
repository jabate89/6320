<%-- 
    Document   : index
    Created on : Jul 5, 2016, 1:16:21 PM
    Author     : juliusabate
--%>

        <%@ include file="/include/site/navbar.jsp" %>
        
        <div class="container-fluid">
        <div class="jumbotron text-center">
            <h1><abbr title="Between Spring & Fall">Summer</abbr> 2016 </br><small>The <mark>Final</mark> Quarter</small></h1>
        </div>
        </div>
        <div class="container">
            
            
                
            <form action="ProcessForm" method="post">
                
              <div class="well">
                <div class="row">
                
                    <div class="col-md-4">
                        First Name <input type="text" class="inbox" name="fname"/>
                    </div>

                    <div class="col-md-4">Last Name <input type="text" class="inbox" name="lname"/></div>

                    <div class="col-md-4">E-Mail <input type="text" class="inbox" name="email"/></div>
                </div>
             </div>
                
            <div class="row">
                <input type="submit" class="inbox" value="submit" /></br
            </div>
                
            </form>
           
        </div>
        
        <div class="container">
            <blockquote class="blockquote-reverse">
                "This is not Nam, this is bowling.</br>
                There are rules.
                <footer>Walter Sobchack</footer>
            </blockquote>
        </div>
    </body>
    
</html>
