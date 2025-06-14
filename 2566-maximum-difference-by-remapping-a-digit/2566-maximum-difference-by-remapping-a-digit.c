int minMaxDifference(int num) {
    char s[16],n[16];
    sprintf(s,"%d",num);
    strcpy(n,s);
    int p=0;
    while(p<strlen(s) && s[p]=='9'){
        p+=1;
    }
    char c=s[p];
   for(int i=0;s[i]!='\0';i++){
    if(s[i]==c){
        s[i]='9';
    }
   }
   char a=n[0];
   for(int i=0;n[i]!='\0';i++){
    if(n[i]==a){
        n[i]='0';
    }
   }
    return atoi(s)-atoi(n);
}