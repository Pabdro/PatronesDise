package adapter.practice;

public class AdaptadorArtefactos implements IArtefactos{
    private IArtefactosE artefacto;

    public AdaptadorArtefactos(IArtefactosE artefacto) {
        this.artefacto = artefacto;
    }

    @Override
    public void showPrecio() {
        artefacto.showCosto();
    }

    @Override
    public void showTiempo() {
        artefacto.showTiempoDeGarantia();
    }
}
