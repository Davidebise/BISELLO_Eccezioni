import static java.lang.IO.println;

void main(){
    try{
        f();
    }catch(Exception e){
        println("Sono nel main: "+e.getMessage());
    }
}

private void f() throws Exception {
    g();
}

private void g() throws Exception {
    h();
}

private void h() throws Exception {
    throw new Exception("Eccezione lanciata in h");
}