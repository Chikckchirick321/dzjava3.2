public class BmiService {

    public int calculate( float height, int weight)
    {
        //Индекс Массы Тела рассчитывается по формуле: ИМТ = вес (кг) / рост (м)2.

        return (int)( weight / ( height * height ) );
    }

}