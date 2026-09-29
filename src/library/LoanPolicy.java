package library;
# 1. feature/ex04 브랜치 확인
git checkout feature/ex04

# 2. LoanPolicy.java 파일 올바른 내용으로 바로 작성
cat << 'EOF' > src/library/LoanPolicy.java
package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) {
        if (type == MemberType.FACULTY) {
            return 5;
        }
        return 3;
    }
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}
