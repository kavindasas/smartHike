#include <SoftwareSerial.h>
SoftwareSerial s(2,3);
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  s.begin(9600);
  pinMode(8,OUTPUT);
  digitalWrite(8,HIGH);
}

void loop() {
  // put your main code here, to run repeatedly:
  if(s.available() > 0){
    Serial.print((char)s.read());
  }
  if(Serial.available() > 0){
    s.print((char)Serial.read());
  }
}
