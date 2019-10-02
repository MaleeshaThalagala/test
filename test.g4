grammar test;

fullName:NAME;
contact :INT;
addressline : ADRESS;
gender: GENDER;
details:fullName NEWLINE addressline NEWLINE contact NEWLINE gender ;
list : details*;


NAME: [A-Z]+;
//GENDER:['F'||'M'];
ADRESS:[a-z]+;
INT : [0-9]+ ;
SPACE :' ';
NEWLINE:'\n';