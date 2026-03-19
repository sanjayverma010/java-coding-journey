class encap {
    private int empid;

    public void setempid(int eid) {
         empid = eid;
    }

    public int getempid() {
        return empid;
    }
}

class Id {
    public static void main(String[] args) {
        encap e= new encap();
        e.setempid(100);
        System.out.println(e.getempid());
    }
}