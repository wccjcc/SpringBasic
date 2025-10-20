package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //추상화에 의존
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; //AppConfig에서 넣어준 memberRepository가 할당됨
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
