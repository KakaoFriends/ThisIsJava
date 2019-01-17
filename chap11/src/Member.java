public class Member implements Comparable<Member> {
    String name;
    Member(String Name) {
        this.name = name;
    }
    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }
}
