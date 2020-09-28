#include <iostream>
using namespace std;

void main() {
	char addr[80];
	cout << "문자열 입력 : ";

	//문자열을 입력 받으면 while문에 true로 인식
	//무한반복을 exit로 빠져나오기
	while (cin.getline(addr, 80)) {
		if(strcmp(addr,"exit")==0)break;
			cout<<"문자열 출력 : "<<addr<<endl;
			cout << "문자열 입력 :" ;
	}
}