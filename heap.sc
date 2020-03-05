// Detect Buffer Overflows in your code!

def buffer_overflows(cpg : io.shiftleft.codepropertygraph.Cpg) = {
    val src = cpg.call("malloc").filter(_.argument(1).arithmetics).l
    cpg.call("memcpy").whereNonEmpty { call => call.argument(1)
        .reachableBy(src.start)
        .filterNot(_.argument(1)
        .codeExact(call.argument(3).code))
    }.code.l
}

