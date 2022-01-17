
package gui;
import gui.GamePlayer.requestTypes;
public class Controler {
    
    
    public static String signIn(String name , String password){
    return (requestTypes.login.name()+"+"+name+"+"+password);
    }
    
    public static String signUp(String name,  String password , String email){
    return (requestTypes.register.name()+"+"+name+"+"+password+"+"+email);
    }
    
    public static String getData(String name){
    return (requestTypes.getData.name()+"+"+name);
    }
     public static String setData(String name,String wi,String lo,String ti){
    return (requestTypes.setData.name()+"+"+name+"+"+wi+"+"+lo+"+"+ti);
    }
    
     public static String createroom(){
    return (requestTypes.createroom.name());
    }

   
}
