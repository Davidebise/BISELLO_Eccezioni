import static java.lang.IO.println;

void main(){
    try{
        f();
    }catch(BiselloNotFound e){
        println("Sono nel main: "+e.getMessage() + "Status Code: " + e.getStatusCode());
        println(Arrays.toString(e.getStackTrace())); //fa vedere la propagazione
    }
}

private void f() throws BiselloNotFound {
    g();
}

private void g() throws BiselloNotFound {
    h();
}

private void h() throws BiselloNotFound {
    throw new BiselloNotFound("Eccezione lanciata in h",8);
}