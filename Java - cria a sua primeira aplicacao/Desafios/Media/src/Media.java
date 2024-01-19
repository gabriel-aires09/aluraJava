public class Media {
    Integer notaUm;
    Integer notaDois;
    
    public Media(Integer notaUm, Integer notaDois) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }

    public Integer realizarMedia(Integer notaUm, Integer notaDois){
        Integer media = (notaUm + notaDois) / 2;
        return media;
    }


}
