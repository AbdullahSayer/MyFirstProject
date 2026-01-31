/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aemond;




class phone{
private int volume;

public int getVoulme(){
return volume;
}

public void setVolume(int v){
if(v>0&&v<100)
  volume = v;
else{
 System.out.println("The volume has to be between 0 and 100");
}
}
public void volumeUP(){
  if (volume<100)
   volume++;
}
public void volumeDOWN(){
  if (volume>0)
   volume--;
}
}
public class Aemond {

    
    public static void main(String[] args) {
       phone v = new phone();
       v.setVolume(68);
       v.volumeUP();
       v.volumeDOWN();
       v.volumeDOWN();
       
        System.out.println(v.getVoulme());
    }
    
}


