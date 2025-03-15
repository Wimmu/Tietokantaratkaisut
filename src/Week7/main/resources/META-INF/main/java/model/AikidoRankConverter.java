package Week7.main.resources.META;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AikidoRankConverter implements AttributeConverter<AikidoRank, Integer> {

    @Override
    public Integer convertToDatabaseColumn(AikidoRank rank) {
        if (rank == null) {
            return null;
        }
        return rank.getValue();
    }

    @Override
    public AikidoRank convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        return AikidoRank.fromValue(dbData);
    }
}
