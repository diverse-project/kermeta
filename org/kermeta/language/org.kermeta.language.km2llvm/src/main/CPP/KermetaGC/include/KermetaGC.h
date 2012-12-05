#include "llvm/CodeGen/GCStrategy.h"
#include "llvm/CodeGen/GCMetadata.h"
#include "llvm/Support/Compiler.h"

using namespace llvm;

namespace {
  class LLVM_LIBRARY_VISIBILITY KermetaGC : public GCStrategy {
  public:
    KermetaGC();
  };
}
