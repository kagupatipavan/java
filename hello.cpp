#include<bits/stdc++.h>
using namespace std;
int pow(int a,int b){
    if(b==1)
    return a;
    else
    return pow(a,b-1)*a;
}
int main(){
    int a,b;
    cin>>a>>b;
    cout<<pow(a,b);
}