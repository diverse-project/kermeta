/* Generated By:JavaCC: Do not edit this line. EmfaticParserTokenManager.java */
package org.eclipse.emf.emfatic.core.lang.gen.parser;
import org.eclipse.emf.emfatic.core.lang.gen.ast.*;
import org.eclipse.gymnast.runtime.core.ast.*;

public class EmfaticParserTokenManager implements EmfaticParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8L) != 0L)
            return 0;
         if ((active0 & 0x1ffffffc0L) != 0L)
         {
            jjmatchedKind = 71;
            return 26;
         }
         return -1;
      case 1:
         if ((active0 & 0x9000000L) != 0L)
            return 26;
         if ((active0 & 0x1f6ffffc0L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 1;
            return 26;
         }
         return -1;
      case 2:
         if ((active0 & 0xc000L) != 0L)
            return 26;
         if ((active0 & 0x1f6ff3fc0L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 2;
            return 26;
         }
         return -1;
      case 3:
         if ((active0 & 0x52002000L) != 0L)
            return 26;
         if ((active0 & 0x1a4ff1fc0L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 3;
            return 26;
         }
         return -1;
      case 4:
         if ((active0 & 0x4001080L) != 0L)
            return 26;
         if ((active0 & 0x1a0ff0f40L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 4;
            return 26;
         }
         return -1;
      case 5:
         if ((active0 & 0x100200100L) != 0L)
            return 26;
         if ((active0 & 0xa0df0e40L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 5;
            return 26;
         }
         return -1;
      case 6:
         if ((active0 & 0xa00f0600L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 6;
            return 26;
         }
         if ((active0 & 0xd00840L) != 0L)
            return 26;
         return -1;
      case 7:
         if ((active0 & 0xa0030200L) != 0L)
            return 26;
         if ((active0 & 0xc0400L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 7;
            return 26;
         }
         return -1;
      case 8:
         if ((active0 & 0x40400L) != 0L)
            return 26;
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 8;
            return 26;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 52);
      case 35:
         return jjStopAtPos(0, 54);
      case 36:
         return jjStopAtPos(0, 53);
      case 38:
         return jjStopAtPos(0, 60);
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         return jjStopAtPos(0, 47);
      case 43:
         return jjStopAtPos(0, 48);
      case 44:
         return jjStopAtPos(0, 44);
      case 45:
         jjmatchedKind = 49;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L);
      case 46:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 58:
         return jjStopAtPos(0, 45);
      case 59:
         return jjStopAtPos(0, 46);
      case 60:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0x800000000000000L);
      case 61:
         return jjStopAtPos(0, 50);
      case 62:
         jjmatchedKind = 62;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L);
      case 63:
         return jjStopAtPos(0, 51);
      case 64:
         return jjStopAtPos(0, 55);
      case 91:
         return jjStopAtPos(0, 39);
      case 93:
         return jjStopAtPos(0, 40);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2200L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x20100000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40000800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000500L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x8400000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x814000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x102040000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x280000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10028000L);
      case 123:
         return jjStopAtPos(0, 37);
      case 125:
         return jjStopAtPos(0, 38);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(1, 3);
         break;
      case 46:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         break;
      case 60:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 62:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         else if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0xa4008040L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 100:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 26);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x914000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40280400L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10020000L);
      case 112:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(1, 27, 26);
         break;
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x2440000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x50080L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 26);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x10200000L);
      case 108:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 26);
         return jjMoveStringLiteralDfa3_0(active0, 0x4020000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80001100L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100100000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x880200L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x20002c00L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x42000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20020000L);
      case 100:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 26);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 26);
         return jjMoveStringLiteralDfa4_0(active0, 0x80481c00L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 109:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 26);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x100800100L);
      case 113:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 26);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000080L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 26);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000800L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 26);
         return jjMoveStringLiteralDfa5_0(active0, 0x400700L);
      case 115:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 26);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x200a0000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 119:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 26);
         return jjMoveStringLiteralDfa6_0(active0, 0x500000L);
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x60000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 115:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 26);
         break;
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 26);
         return jjMoveStringLiteralDfa6_0(active0, 0x80080000L);
      case 118:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 121:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x80400L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 100:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 26);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 26);
         break;
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 26);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 26);
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x30000L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000L);
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(6, 11, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 26);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(7, 29, 26);
         break;
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(7, 9, 26);
         break;
      case 121:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 16, 26);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(7, 31, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(8, 10, 26);
         break;
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(8, 18, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(9, 19, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 27;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 67)
                        kind = 67;
                     jjCheckNAdd(23);
                  }
                  else if ((0x100003600L & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                     jjCheckNAdd(6);
                  }
                  else if (curChar == 39)
                     jjAddStates(0, 1);
                  else if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddStates(5, 7);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 2:
               case 3:
                  if (curChar == 10 && kind > 1)
                     kind = 1;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if ((0x100003600L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if (curChar == 34)
                     jjCheckNAddStates(2, 4);
                  break;
               case 9:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 10:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 11:
                  if (curChar == 34 && kind > 63)
                     kind = 63;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 15:
                  if (curChar == 39)
                     jjAddStates(0, 1);
                  break;
               case 17:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 18:
                  if (curChar == 39 && kind > 64)
                     kind = 64;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 22:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 67)
                     kind = 67;
                  jjCheckNAdd(23);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjstateSet[jjnewStateCnt++] = 26;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 71)
                        kind = 71;
                     jjCheckNAdd(26);
                  }
                  else if (curChar == 126)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 1:
                  jjAddStates(5, 7);
                  break;
               case 8:
                  if (curChar == 92)
                     jjAddStates(8, 9);
                  break;
               case 9:
                  if ((0x14404010000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 10:
                  jjCheckNAddStates(2, 4);
                  break;
               case 16:
                  if (curChar == 92)
                     jjAddStates(10, 11);
                  break;
               case 17:
                  if ((0x14404010000000L & l) != 0L)
                     jjCheckNAdd(18);
                  break;
               case 22:
                  jjCheckNAdd(18);
                  break;
               case 24:
                  if (curChar == 126)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
               case 26:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjCheckNAdd(26);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 7);
                  break;
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 4);
                  break;
               case 22:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 27 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x10L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   16, 22, 8, 10, 11, 1, 2, 4, 9, 12, 17, 19, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\160\141\143\153\141\147\145", 
"\143\154\141\163\163", "\151\155\160\157\162\164", "\141\142\163\164\162\141\143\164", 
"\151\156\164\145\162\146\141\143\145", "\145\170\164\145\156\144\163", "\163\165\160\145\162", "\141\164\164\162", 
"\162\145\146", "\166\141\154", "\162\145\141\144\157\156\154\171", 
"\166\157\154\141\164\151\154\145", "\164\162\141\156\163\151\145\156\164", 
"\165\156\163\145\164\164\141\142\154\145", "\144\145\162\151\166\145\144", "\165\156\151\161\165\145", 
"\157\162\144\145\162\145\144", "\162\145\163\157\154\166\145", "\151\144", "\164\162\165\145", 
"\146\141\154\163\145", "\157\160", "\166\157\151\144", "\144\141\164\141\164\171\160\145", 
"\145\156\165\155", "\155\141\160\145\156\164\162\171", "\164\150\162\157\167\163", null, null, 
null, null, "\173", "\175", "\133", "\135", "\50", "\51", "\56", "\54", "\72", 
"\73", "\52", "\53", "\55", "\75", "\77", "\41", "\44", "\43", "\100", "\56\56", 
"\55\76", "\76\74", "\74\76", "\46", "\74", "\76", null, null, null, null, null, null, 
null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "WithinComment", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffe1ffffffc1L, 0x89L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
static final long[] jjtoMore = {
   0x20L, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[27];
private final int[] jjstateSet = new int[54];
protected char curChar;
public EmfaticParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public EmfaticParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 27; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 5)
         {
            jjmatchedKind = 5;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

}
