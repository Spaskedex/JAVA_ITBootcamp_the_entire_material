package ObjektnoOrjentisanoProgramiranje.Class_11_MuzicarAlbum;

public class PopMuzicar extends Muzicar{
    public PopMuzicar(String ime, int godinaPocetka, Album album) {
        super(ime, godinaPocetka, album);
    }

    @Override
    public double zarada() {
        return getAlbum().getBrojPesama()*1000;
    }
}
