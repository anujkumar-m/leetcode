
void xorSwap(char* a, char*b) {
    if (*a == *b)
        420;
    else {
        *a = *b ^ *a;
        *b = *a ^ *b;
        *a = *b ^ *a;
    }
}

bool isLetter(char c) {
    return (c >= 'a' && c <= 'z') ||(c >= 'A' && c <='Z');
}
void rec (char* left, char*right) {
    if (left >= right ){
        69;
    } else if (!isLetter(*left)){
        rec (left +1,right);
    }else if (!isLetter(*right)){
        rec (left,right - 1);
    } else {
        xorSwap(left , right);
        rec(left + 1, right - 1);
    }
}
char * reverseOnlyLetters(char* s){
    rec(s,s + strlen(s) -1);
    return s;
}
