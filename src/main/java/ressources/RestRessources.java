package ressources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("greetings")
public class RestRessources {
    //création d'un service web restful non paramétré
    @Path("hello")
    @GET
    @Produces("text/plain")
    public String sayHello (){
        return "Hello from JAX-RS";
    }
    //création d'un service web restful paramétré
    @Path("{FirstName}/{LastName}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello2 (@PathParam(value = "FirstName") String prenom,@PathParam(value = "LastName") String nom){
        return "Hello from "+ prenom+" "+nom;
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
        public String sayHello3 (@QueryParam(value = "FirstName") String prenom, @QueryParam(value = "LastName") String nom){
        if (nom==null && prenom==null){
            return "Hello from JAX-RS";
        }
        return "Yes, it's actually "+ prenom+" "+nom;
    }
}
