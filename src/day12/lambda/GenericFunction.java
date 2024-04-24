package day12.lambda;


@FunctionalInterface
public interface GenericFunction<X,Y> {
    //x를 주면 y를 리턴해줄게
    Y apply(X x);

}
