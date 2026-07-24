package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;

public class ReportDTO {
    private AirCraftSingletonEager airCraftSingletonEager;
    private Pessoa pessoa;
    private Currency currency;

    private ReportDTO(Builder builder) {
        airCraftSingletonEager = builder.airCraftSingletonEager;
        pessoa = builder.pessoa;
        currency = builder.currency;
    }


    public static final class Builder {
        private AirCraftSingletonEager airCraftSingletonEager;
        private Pessoa pessoa;
        private Currency currency;

        private Builder() {
        }

        public static Builder newReportDTO() {
            return new Builder();
        }

        public Builder setAirCraftSingletonEager(AirCraftSingletonEager val) {
            airCraftSingletonEager = val;
            return this;
        }

        public Builder setPessoa(Pessoa val) {
            pessoa = val;
            return this;
        }

        public Builder setCurrency(Currency val) {
            currency = val;
            return this;
        }

        public ReportDTO build() {
            return new ReportDTO(this);
        }
    }
}
