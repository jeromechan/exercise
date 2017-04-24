package com {

  package aboutcoder {

    private[com] class BlockAnalysis {
      protected[aboutcoder] def useStarChart() {}

      class LegOfJourney {
        private[BlockAnalysis] val distance = 100
      }

      private[this] var speed = 200
    }

  }

  package launch {

    import com.aboutcoder._

    object Vehicle {
      private[launch] val guide = new BlockAnalysis
    }

  }

}