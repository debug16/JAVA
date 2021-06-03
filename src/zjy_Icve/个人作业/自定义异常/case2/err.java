package zjy_Icve.个人作业.自定义异常.case2;

class err extends Exception {
    private String e;


    public err(String e) {
        this.e = e;
    }

    public String getE() {
        return e;
    }
}
