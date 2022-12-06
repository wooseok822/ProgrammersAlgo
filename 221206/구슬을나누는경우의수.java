import java.math.*;   // BigInteger를 사용하기 위함 -> Long보다 더 큰 자료형을 사용해야할 때

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = new BigInteger("1");    // answer를 1로 초기화
        if(balls != share){
            BigInteger a = fact(balls - share).multiply(fact(share));   // multiply를 이용해서 곱한다.
            BigInteger b = fact(balls);
        
            answer = b.divide(a); // divide를 이용해 나눈다.
        }
        
        return answer;
    }
    public BigInteger fact(int num){
        BigInteger mul = new BigInteger("1"); // 1로 초기화
        for(long i=1;i<=num;i++){
            mul = mul.multiply(BigInteger.valueOf(i)); // i의 값을 BigInteger 형태로 바꾸어 반복문 안의 i를 다 곱한 값을 mul에 넣어준다.
        }
        
        return mul;
    }
}
