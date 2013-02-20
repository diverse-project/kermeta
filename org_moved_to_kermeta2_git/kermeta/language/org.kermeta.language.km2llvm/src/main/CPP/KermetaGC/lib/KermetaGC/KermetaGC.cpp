
#include "KermetaGC.h"

namespace {
KermetaGC::KermetaGC() {
}

  GCRegistry::Add<KermetaGC>
  X("KermetaGC", "My bespoke garbage collector.");
}

