bool isValid(char* s)
 {
    char str[strlen(s)];
    int top=-1;
    for(int i=0;i<strlen(s);i++) 
    {
        if(s[i]=='(' ||  s[i]=='{' || s[i]=='[' )
        {str[++top]=s[i];}
        else {
        if(top==-1||( s[i]==')'&&str[top] !='(')||(s[i]=='}'&&str[top]!='{')||(s[i]==']'&&str[top]!='[')) 
        {
            return false;
        }
         top--;
        }
       

    }
    return top == -1;
}