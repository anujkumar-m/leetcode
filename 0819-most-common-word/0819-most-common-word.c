#define MAX_WORDS 1000
char* mostCommonWord(char* paragraph, char** banned, int bannedSize) {
    char **str=(char**)malloc(MAX_WORDS*sizeof(char*));
     for (int i = 0; paragraph[i]; i++) {
        paragraph[i] = tolower(paragraph[i]);
    }
    char *delim = " !?',;.\""; 
    char *token=strtok(paragraph,delim);
    int i=0;
    while(token!=NULL){
        str[i]=(char*)malloc(strlen(token)+1);
        strcpy(str[i],token);
        i++;
        token=strtok(NULL,delim);
    }
    int arr[MAX_WORDS] = {0};
    for (int j = 0; j < i; j++) {
        int isBanned = 0;
        for (int k = 0; k < bannedSize; k++) {
            if (strcmp(str[j], banned[k]) == 0) {
                isBanned = 1;
                break;
            }
        }
        if (!isBanned) {
            for (int l = 0; l < i; l++) {
                if (strcmp(str[j], str[l]) == 0) {
                    arr[j]++;
                }
            }
        }
    }

    int max = 0;
    int maxIndex = 0;
    for (int j = 0; j < i; j++) {
        if (arr[j] > max) {
            max = arr[j];
            maxIndex = j;
        }
    }
  char* result = (char*)malloc(strlen(str[maxIndex]) + 1);
    strcpy(result, str[maxIndex]);
        for (int j = 0; j < i; j++) {
        free(str[j]);
    }
    free(str);
    return result;
}