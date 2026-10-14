import static java.lang.IO.println;

void main(){
    try{
        f();
    }catch(Exception e){

    }
}

private void f(){
    g();
}

private void g() throws Exception {
    h();
}

private void h() throws Exception {
    throw new Exception("Eccezione lanciata in h");
}