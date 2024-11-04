package ObjektnoOrjentisanoProgramiranje.Class_11_MuzicarAlbum;

public class RokMuzicar extends Muzicar{
    public RokMuzicar(String ime, int godinaPocetka, Album album) {
        super(ime, godinaPocetka, album);
    }


 ;   @Override
    public double zarada() {
        return getAlbum().getBrojPesama()*750;
    }
}
