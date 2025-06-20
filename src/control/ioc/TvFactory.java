package control.ioc;

import control.*;


public class TvFactory {

    private  static TvFactory tvFactory = null;

    private TvFactory() {

    }

    public static TvFactory getInstance(){
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    public Tv factory(String speakerName, String wooferName) {
        //삼성 tv 객체화 하려면 뭐가 필요함? 스피커 주소값 필요.
        //스피커가 객체화 하려면 뭐가 필요함? 우퍼의 주소값 필요.
        Woofer woofer = switch (wooferName) {
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}
