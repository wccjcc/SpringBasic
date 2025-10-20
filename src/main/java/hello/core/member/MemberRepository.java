package hello.core.member;

public interface MemberRepository {

    void save(Member memember);

    Member findById(Long memberId);
}
