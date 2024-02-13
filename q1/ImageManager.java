public class ImageManager {
    private RendererInterface renderer;
    public void setRenderer(RendererInterface renderer) {
		this.renderer = renderer;
	}
	public void show() {
		renderer.showImage();
	}
}

