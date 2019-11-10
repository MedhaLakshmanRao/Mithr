#include "Talkie.h"
//#include "Vocab_US_Large.h"
#include "Vocab_Special.h"
#include "Vocab_US_TI99.h"

Talkie voice;
int trig=5;
int echo=4;

void setup() {
  
 Serial.begin(9600);
 pinMode(trig,OUTPUT);
 pinMode(echo,INPUT);
 pinMode(7,OUTPUT);
 
}

void loop() {
  digitalWrite(trig,LOW);
  delayMicroseconds(2);
  digitalWrite(trig,HIGH);
  delayMicroseconds(100);
  
  long x=pulseIn(echo,HIGH);
  long y=x/58;
  Serial.print(y);
  Serial.println("cm");

  
  if(y<=25){
    digitalWrite(7,HIGH);
    
    voice.say(spPAUSE2);
    //voice.say(spt_HEY);
    voice.say(spPAUSE2);
    voice.say(spt_CHECK);
    voice.say(spt_ME);
    voice.say(spt_OUT);
    voice.say(spt_FOR);
    voice.say(spt_SOME);
    voice.say(spt_GAMES);
  }
  else 
    digitalWrite(7,LOW);

}
