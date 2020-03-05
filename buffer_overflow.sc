@main def execute(payload: String) = {
    loadCpg(payload);
    val src = cpg.call("malloc").filter(_.argument(1).arithmetics).l

    cpg.call("memcpy").whereNonEmpty { call => call.argument(1)
        .reachableBy(src.start)
        .filterNot(_.argument(1)
        .codeExact(call.argument(3).code))
    }.code.l
}
